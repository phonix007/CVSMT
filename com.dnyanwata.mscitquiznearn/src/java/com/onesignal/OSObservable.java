/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.onesignal;

import com.onesignal.OSUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class OSObservable<ObserverType, StateType> {
    private boolean fireOnMainThread;
    private String methodName;
    private List<Object> observers;

    OSObservable(String string2, boolean bl) {
        this.methodName = string2;
        this.fireOnMainThread = bl;
        this.observers = new ArrayList();
    }

    void addObserver(ObserverType ObserverType) {
        this.observers.add((Object)new WeakReference(ObserverType));
    }

    void addObserverStrong(ObserverType ObserverType) {
        this.observers.add(ObserverType);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean notifyChange(final StateType StateType) {
        Iterator iterator = this.observers.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            final Object object = iterator.next();
            if (object instanceof WeakReference) {
                object = ((WeakReference)object).get();
            }
            if (object == null) continue;
            Class class_ = object.getClass();
            try {
                String string2 = this.methodName;
                Class[] arrclass = new Class[]{StateType.getClass()};
                final Method method = class_.getDeclaredMethod(string2, arrclass);
                method.setAccessible(true);
                if (this.fireOnMainThread) {
                    OSUtils.runOnMainUIThread(new Runnable(){

                        public void run() {
                            try {
                                Method method2 = method;
                                Object object2 = object;
                                Object[] arrobject = new Object[]{StateType};
                                method2.invoke(object2, arrobject);
                                return;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                invocationTargetException.printStackTrace();
                                return;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                illegalAccessException.printStackTrace();
                                return;
                            }
                        }
                    });
                } else {
                    try {
                        method.invoke(object, new Object[]{StateType});
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        invocationTargetException.printStackTrace();
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        illegalAccessException.printStackTrace();
                    }
                }
                bl = true;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                noSuchMethodException.printStackTrace();
                continue;
            }
            break;
        }
        return bl;
    }

    void removeObserver(ObserverType ObserverType) {
        for (int i = 0; i < this.observers.size(); ++i) {
            if (!((WeakReference)this.observers.get(i)).get().equals(ObserverType)) continue;
            this.observers.remove(i);
            return;
        }
    }

}

