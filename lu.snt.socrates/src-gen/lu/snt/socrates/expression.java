/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.expression#getExpb <em>Expb</em>}</li>
 * </ul>
 *
 * @see lu.snt.socrates.SocratesPackage#getexpression()
 * @model
 * @generated
 */
public interface expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Expb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expb</em>' containment reference.
   * @see #setExpb(expressionb)
   * @see lu.snt.socrates.SocratesPackage#getexpression_Expb()
   * @model containment="true"
   * @generated
   */
  expressionb getExpb();

  /**
   * Sets the value of the '{@link lu.snt.socrates.expression#getExpb <em>Expb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expb</em>' containment reference.
   * @see #getExpb()
   * @generated
   */
  void setExpb(expressionb value);

} // expression
