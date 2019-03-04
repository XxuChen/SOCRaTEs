/**
 * generated by Xtext 2.17.0.M1
 */
package lu.snt.socrates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expressionb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.snt.socrates.expressionb#getTerm <em>Term</em>}</li>
 *   <li>{@link lu.snt.socrates.expressionb#getExpprime <em>Expprime</em>}</li>
 * </ul>
 *
 * @see lu.snt.socrates.SocratesPackage#getexpressionb()
 * @model
 * @generated
 */
public interface expressionb extends EObject
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(expressionterm)
   * @see lu.snt.socrates.SocratesPackage#getexpressionb_Term()
   * @model containment="true"
   * @generated
   */
  expressionterm getTerm();

  /**
   * Sets the value of the '{@link lu.snt.socrates.expressionb#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(expressionterm value);

  /**
   * Returns the value of the '<em><b>Expprime</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expprime</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expprime</em>' containment reference.
   * @see #setExpprime(expressionprime)
   * @see lu.snt.socrates.SocratesPackage#getexpressionb_Expprime()
   * @model containment="true"
   * @generated
   */
  expressionprime getExpprime();

  /**
   * Sets the value of the '{@link lu.snt.socrates.expressionb#getExpprime <em>Expprime</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expprime</em>' containment reference.
   * @see #getExpprime()
   * @generated
   */
  void setExpprime(expressionprime value);

} // expressionb
