/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates.impl;

import lu.snt.socrates.SocratesPackage;
import lu.snt.socrates.boundterm;
import lu.snt.socrates.forAllformula;
import lu.snt.socrates.formula;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for Allformula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.impl.forAllformulaImpl#getBound <em>Bound</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.forAllformulaImpl#getForallchild <em>Forallchild</em>}</li>
 * </ul>
 *
 * @generated
 */
public class forAllformulaImpl extends MinimalEObjectImpl.Container implements forAllformula
{
  /**
   * The cached value of the '{@link #getBound() <em>Bound</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBound()
   * @generated
   * @ordered
   */
  protected boundterm bound;

  /**
   * The cached value of the '{@link #getForallchild() <em>Forallchild</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForallchild()
   * @generated
   * @ordered
   */
  protected formula forallchild;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected forAllformulaImpl()
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
    return SocratesPackage.Literals.FOR_ALLFORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boundterm getBound()
  {
    return bound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBound(boundterm newBound, NotificationChain msgs)
  {
    boundterm oldBound = bound;
    bound = newBound;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.FOR_ALLFORMULA__BOUND, oldBound, newBound);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBound(boundterm newBound)
  {
    if (newBound != bound)
    {
      NotificationChain msgs = null;
      if (bound != null)
        msgs = ((InternalEObject)bound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.FOR_ALLFORMULA__BOUND, null, msgs);
      if (newBound != null)
        msgs = ((InternalEObject)newBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.FOR_ALLFORMULA__BOUND, null, msgs);
      msgs = basicSetBound(newBound, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.FOR_ALLFORMULA__BOUND, newBound, newBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formula getForallchild()
  {
    return forallchild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForallchild(formula newForallchild, NotificationChain msgs)
  {
    formula oldForallchild = forallchild;
    forallchild = newForallchild;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.FOR_ALLFORMULA__FORALLCHILD, oldForallchild, newForallchild);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForallchild(formula newForallchild)
  {
    if (newForallchild != forallchild)
    {
      NotificationChain msgs = null;
      if (forallchild != null)
        msgs = ((InternalEObject)forallchild).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.FOR_ALLFORMULA__FORALLCHILD, null, msgs);
      if (newForallchild != null)
        msgs = ((InternalEObject)newForallchild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.FOR_ALLFORMULA__FORALLCHILD, null, msgs);
      msgs = basicSetForallchild(newForallchild, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.FOR_ALLFORMULA__FORALLCHILD, newForallchild, newForallchild));
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
      case SocratesPackage.FOR_ALLFORMULA__BOUND:
        return basicSetBound(null, msgs);
      case SocratesPackage.FOR_ALLFORMULA__FORALLCHILD:
        return basicSetForallchild(null, msgs);
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
      case SocratesPackage.FOR_ALLFORMULA__BOUND:
        return getBound();
      case SocratesPackage.FOR_ALLFORMULA__FORALLCHILD:
        return getForallchild();
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
      case SocratesPackage.FOR_ALLFORMULA__BOUND:
        setBound((boundterm)newValue);
        return;
      case SocratesPackage.FOR_ALLFORMULA__FORALLCHILD:
        setForallchild((formula)newValue);
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
      case SocratesPackage.FOR_ALLFORMULA__BOUND:
        setBound((boundterm)null);
        return;
      case SocratesPackage.FOR_ALLFORMULA__FORALLCHILD:
        setForallchild((formula)null);
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
      case SocratesPackage.FOR_ALLFORMULA__BOUND:
        return bound != null;
      case SocratesPackage.FOR_ALLFORMULA__FORALLCHILD:
        return forallchild != null;
    }
    return super.eIsSet(featureID);
  }

} //forAllformulaImpl
