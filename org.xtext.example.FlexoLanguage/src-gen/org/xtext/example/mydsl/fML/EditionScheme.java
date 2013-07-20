/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionScheme#getEditionSchemeType <em>Edition Scheme Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionScheme#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionScheme#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionScheme#getEditionAction <em>Edition Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionScheme()
 * @model
 * @generated
 */
public interface EditionScheme extends EObject
{
  /**
   * Returns the value of the '<em><b>Edition Scheme Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.EditionSchemeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edition Scheme Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edition Scheme Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.EditionSchemeType
   * @see #setEditionSchemeType(EditionSchemeType)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionScheme_EditionSchemeType()
   * @model
   * @generated
   */
  EditionSchemeType getEditionSchemeType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.EditionScheme#getEditionSchemeType <em>Edition Scheme Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edition Scheme Type</em>' attribute.
   * @see org.xtext.example.mydsl.fML.EditionSchemeType
   * @see #getEditionSchemeType()
   * @generated
   */
  void setEditionSchemeType(EditionSchemeType value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionScheme_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.EditionScheme#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionScheme_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameter();

  /**
   * Returns the value of the '<em><b>Edition Action</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.EditionAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edition Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edition Action</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionScheme_EditionAction()
   * @model containment="true"
   * @generated
   */
  EList<EditionAction> getEditionAction();

} // EditionScheme
