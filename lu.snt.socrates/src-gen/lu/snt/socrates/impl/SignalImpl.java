/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates.impl;

import lu.snt.socrates.Signal;
import lu.snt.socrates.SignalID;
import lu.snt.socrates.SocratesPackage;
import lu.snt.socrates.timedterm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.impl.SignalImpl#getSignalid <em>Signalid</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.SignalImpl#getTimdedterm <em>Timdedterm</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.SignalImpl#getIndx1 <em>Indx1</em>}</li>
 *   <li>{@link lu.snt.socrates.impl.SignalImpl#getIndx2 <em>Indx2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalImpl extends MinimalEObjectImpl.Container implements Signal
{
  /**
   * The cached value of the '{@link #getSignalid() <em>Signalid</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalid()
   * @generated
   * @ordered
   */
  protected SignalID signalid;

  /**
   * The cached value of the '{@link #getTimdedterm() <em>Timdedterm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimdedterm()
   * @generated
   * @ordered
   */
  protected timedterm timdedterm;

  /**
   * The default value of the '{@link #getIndx1() <em>Indx1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndx1()
   * @generated
   * @ordered
   */
  protected static final String INDX1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndx1() <em>Indx1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndx1()
   * @generated
   * @ordered
   */
  protected String indx1 = INDX1_EDEFAULT;

  /**
   * The default value of the '{@link #getIndx2() <em>Indx2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndx2()
   * @generated
   * @ordered
   */
  protected static final String INDX2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIndx2() <em>Indx2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndx2()
   * @generated
   * @ordered
   */
  protected String indx2 = INDX2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignalImpl()
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
    return SocratesPackage.Literals.SIGNAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalID getSignalid()
  {
    if (signalid != null && signalid.eIsProxy())
    {
      InternalEObject oldSignalid = (InternalEObject)signalid;
      signalid = (SignalID)eResolveProxy(oldSignalid);
      if (signalid != oldSignalid)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SocratesPackage.SIGNAL__SIGNALID, oldSignalid, signalid));
      }
    }
    return signalid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalID basicGetSignalid()
  {
    return signalid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignalid(SignalID newSignalid)
  {
    SignalID oldSignalid = signalid;
    signalid = newSignalid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.SIGNAL__SIGNALID, oldSignalid, signalid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public timedterm getTimdedterm()
  {
    return timdedterm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimdedterm(timedterm newTimdedterm, NotificationChain msgs)
  {
    timedterm oldTimdedterm = timdedterm;
    timdedterm = newTimdedterm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SocratesPackage.SIGNAL__TIMDEDTERM, oldTimdedterm, newTimdedterm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimdedterm(timedterm newTimdedterm)
  {
    if (newTimdedterm != timdedterm)
    {
      NotificationChain msgs = null;
      if (timdedterm != null)
        msgs = ((InternalEObject)timdedterm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.SIGNAL__TIMDEDTERM, null, msgs);
      if (newTimdedterm != null)
        msgs = ((InternalEObject)newTimdedterm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SocratesPackage.SIGNAL__TIMDEDTERM, null, msgs);
      msgs = basicSetTimdedterm(newTimdedterm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.SIGNAL__TIMDEDTERM, newTimdedterm, newTimdedterm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndx1()
  {
    return indx1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndx1(String newIndx1)
  {
    String oldIndx1 = indx1;
    indx1 = newIndx1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.SIGNAL__INDX1, oldIndx1, indx1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIndx2()
  {
    return indx2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndx2(String newIndx2)
  {
    String oldIndx2 = indx2;
    indx2 = newIndx2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SocratesPackage.SIGNAL__INDX2, oldIndx2, indx2));
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
      case SocratesPackage.SIGNAL__TIMDEDTERM:
        return basicSetTimdedterm(null, msgs);
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
      case SocratesPackage.SIGNAL__SIGNALID:
        if (resolve) return getSignalid();
        return basicGetSignalid();
      case SocratesPackage.SIGNAL__TIMDEDTERM:
        return getTimdedterm();
      case SocratesPackage.SIGNAL__INDX1:
        return getIndx1();
      case SocratesPackage.SIGNAL__INDX2:
        return getIndx2();
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
      case SocratesPackage.SIGNAL__SIGNALID:
        setSignalid((SignalID)newValue);
        return;
      case SocratesPackage.SIGNAL__TIMDEDTERM:
        setTimdedterm((timedterm)newValue);
        return;
      case SocratesPackage.SIGNAL__INDX1:
        setIndx1((String)newValue);
        return;
      case SocratesPackage.SIGNAL__INDX2:
        setIndx2((String)newValue);
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
      case SocratesPackage.SIGNAL__SIGNALID:
        setSignalid((SignalID)null);
        return;
      case SocratesPackage.SIGNAL__TIMDEDTERM:
        setTimdedterm((timedterm)null);
        return;
      case SocratesPackage.SIGNAL__INDX1:
        setIndx1(INDX1_EDEFAULT);
        return;
      case SocratesPackage.SIGNAL__INDX2:
        setIndx2(INDX2_EDEFAULT);
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
      case SocratesPackage.SIGNAL__SIGNALID:
        return signalid != null;
      case SocratesPackage.SIGNAL__TIMDEDTERM:
        return timdedterm != null;
      case SocratesPackage.SIGNAL__INDX1:
        return INDX1_EDEFAULT == null ? indx1 != null : !INDX1_EDEFAULT.equals(indx1);
      case SocratesPackage.SIGNAL__INDX2:
        return INDX2_EDEFAULT == null ? indx2 != null : !INDX2_EDEFAULT.equals(indx2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (indx1: ");
    result.append(indx1);
    result.append(", indx2: ");
    result.append(indx2);
    result.append(')');
    return result.toString();
  }

} //SignalImpl
