/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.ModelSlot#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.ModelSlot#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.ModelSlot#getUri <em>Uri</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.ModelSlot#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.ModelSlot#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot()
 * @model
 * @generated
 */
public interface ModelSlot extends EObject
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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ModelSlot#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.MSTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.MSTYPE
   * @see #setType(MSTYPE)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot_Type()
   * @model
   * @generated
   */
  MSTYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ModelSlot#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.MSTYPE
   * @see #getType()
   * @generated
   */
  void setType(MSTYPE value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ModelSlot#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot_Required()
   * @model
   * @generated
   */
  String getRequired();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ModelSlot#getRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #getRequired()
   * @generated
   */
  void setRequired(String value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see #setReadOnly(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getModelSlot_ReadOnly()
   * @model
   * @generated
   */
  String getReadOnly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ModelSlot#getReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see #getReadOnly()
   * @generated
   */
  void setReadOnly(String value);

} // ModelSlot
