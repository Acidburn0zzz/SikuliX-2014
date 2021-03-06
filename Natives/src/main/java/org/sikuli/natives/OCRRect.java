/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRRect {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OCRRect(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRRect obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRRect(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OCRRect() {
    this(VisionProxyJNI.new_OCRRect__SWIG_0(), true);
  }

  public OCRRect(int x_, int y_, int width_, int height_) {
    this(VisionProxyJNI.new_OCRRect__SWIG_1(x_, y_, width_, height_), true);
  }

  public void setX(int value) {
    VisionProxyJNI.OCRRect_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return VisionProxyJNI.OCRRect_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    VisionProxyJNI.OCRRect_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return VisionProxyJNI.OCRRect_y_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    VisionProxyJNI.OCRRect_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return VisionProxyJNI.OCRRect_height_get(swigCPtr, this);
  }

  public void setWidth(int value) {
    VisionProxyJNI.OCRRect_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return VisionProxyJNI.OCRRect_width_get(swigCPtr, this);
  }

}
