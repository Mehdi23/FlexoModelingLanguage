/**
 */
package org.xtext.example.mydsl.fML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.DeleteAction#getPatternRole <em>Pattern Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getDeleteAction()
 * @model
 * @generated
 */
public interface DeleteAction extends BuiltInAction
{
  /**
   * Returns the value of the '<em><b>Pattern Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Role</em>' reference.
   * @see #setPatternRole(PatternRole)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getDeleteAction_PatternRole()
   * @model
   * @generated
   */
  PatternRole getPatternRole();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.DeleteAction#getPatternRole <em>Pattern Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Role</em>' reference.
   * @see #getPatternRole()
   * @generated
   */
  void setPatternRole(PatternRole value);

} // DeleteAction
