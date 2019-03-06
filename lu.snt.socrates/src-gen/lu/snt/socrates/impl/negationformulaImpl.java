/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates.impl;

import lu.snt.socrates.SocratesPackage;
import lu.snt.socrates.formula;
import lu.snt.socrates.negationformula;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>negationformula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.impl.negationformulaImpl#getNegationchild <em>Negationchild</em>}</li>
 * </ul>
 *
 * @generated
 */
public class negationformulaImpl extends MinimalEObjectImpl.Container implements negationformula
{
  /**
   * The cached value of the '{@link #getNegationchild() <em>Negationchild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNegationchild()
   * @generated
   * @ordered
   */
  protected formula negationchild;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected negationformulaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SocratesPackage.Literals.NEGATIONFORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formula getNegationchild()
  {
    return negationchild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNegationchild(formula newNegationchild, NotificationChain msgs)
  {
    formula oldNegationchild = negationchild;
    negationchild = newNegationchild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD, oldNegationchild, newNegationchild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNegationchild(formula newNegationchild)
  {
    if (newNegationchild != negationchild)
    {
      NotificationChain msgs = null;
      if (negationchild != null)
        msgs = ((InternalEObject)negationchild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD, null, msgs);
      if (newNegationchild != null)
        msgs = ((InternalEObject)newNegationchild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD, null, msgs);
      msgs = basicSetNegationchild(newNegationchild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD, newNegationchild, newNegationchild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD:
        return basicSetNegationchild(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD:
        return getNegationchild();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD:
        setNegationchild((formula)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD:
        setNegationchild((formula)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SocratesPackage.NEGATIONFORMULA__NEGATIONCHILD:
        return negationchild != null;
    }
    return super.eIsSet(featureID);
  }

} //negationformulaImpl
