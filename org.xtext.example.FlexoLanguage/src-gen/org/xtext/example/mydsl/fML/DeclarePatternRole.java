/**
 */
package org.xtext.example.mydsl.fML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.DeclarePatternRole#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getDeclarePatternRole()
 * @model
 * @generated
 */
public interface DeclarePatternRole extends BuiltInAction
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getDeclarePatternRole_Parameter()
   * @model
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.DeclarePatternRole#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // DeclarePatternRole
