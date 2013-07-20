/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.PatternRole#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.PatternRole#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.PatternRole#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.PatternRole#getModelSlot <em>Model Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getPatternRole()
 * @model
 * @generated
 */
public interface PatternRole extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getPatternRole_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.PatternRole#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.PRTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @see #setType(PRTYPE)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getPatternRole_Type()
   * @model
   * @generated
   */
  PRTYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.PatternRole#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @see #getType()
   * @generated
   */
  void setType(PRTYPE value);

  /**
   * Returns the value of the '<em><b>Model Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Element</em>' attribute.
   * @see #setModelElement(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getPatternRole_ModelElement()
   * @model
   * @generated
   */
  String getModelElement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.PatternRole#getModelElement <em>Model Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Element</em>' attribute.
   * @see #getModelElement()
   * @generated
   */
  void setModelElement(String value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getPatternRole_ModelSlot()
   * @model
   * @generated
   */
  ModelSlot getModelSlot();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.PatternRole#getModelSlot <em>Model Slot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Slot</em>' reference.
   * @see #getModelSlot()
   * @generated
   */
  void setModelSlot(ModelSlot value);

} // PatternRole
