/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.VirtualModel#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.VirtualModel#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.VirtualModel#getUri <em>Uri</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.VirtualModel#getModelSlots <em>Model Slots</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.VirtualModel#getEditionPatterns <em>Edition Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel()
 * @model
 * @generated
 */
public interface VirtualModel extends EObject
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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.VirtualModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.VMTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.VMTYPE
   * @see #setType(VMTYPE)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel_Type()
   * @model
   * @generated
   */
  VMTYPE getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.VirtualModel#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.VMTYPE
   * @see #getType()
   * @generated
   */
  void setType(VMTYPE value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.VirtualModel#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Model Slots</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.ModelSlot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Slots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Slots</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel_ModelSlots()
   * @model containment="true"
   * @generated
   */
  EList<ModelSlot> getModelSlots();

  /**
   * Returns the value of the '<em><b>Edition Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.EditionPattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edition Patterns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edition Patterns</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getVirtualModel_EditionPatterns()
   * @model containment="true"
   * @generated
   */
  EList<EditionPattern> getEditionPatterns();

} // VirtualModel
