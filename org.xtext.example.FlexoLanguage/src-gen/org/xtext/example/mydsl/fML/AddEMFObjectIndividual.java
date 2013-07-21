/**
 */
package org.xtext.example.mydsl.fML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add EMF Object Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.AddEMFObjectIndividual#getEditionPattern <em>Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.AddEMFObjectIndividual#getModelSlot <em>Model Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getAddEMFObjectIndividual()
 * @model
 * @generated
 */
public interface AddEMFObjectIndividual extends BuiltInAction
{
  /**
   * Returns the value of the '<em><b>Edition Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edition Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edition Pattern</em>' reference.
   * @see #setEditionPattern(EditionPattern)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getAddEMFObjectIndividual_EditionPattern()
   * @model
   * @generated
   */
  EditionPattern getEditionPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.AddEMFObjectIndividual#getEditionPattern <em>Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edition Pattern</em>' reference.
   * @see #getEditionPattern()
   * @generated
   */
  void setEditionPattern(EditionPattern value);

  /**
   * Returns the value of the '<em><b>Model Slot</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Slot</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Slot</em>' reference.
   * @see #setModelSlot(ModelSlot)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getAddEMFObjectIndividual_ModelSlot()
   * @model
   * @generated
   */
  ModelSlot getModelSlot();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.AddEMFObjectIndividual#getModelSlot <em>Model Slot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Slot</em>' reference.
   * @see #getModelSlot()
   * @generated
   */
  void setModelSlot(ModelSlot value);

} // AddEMFObjectIndividual
