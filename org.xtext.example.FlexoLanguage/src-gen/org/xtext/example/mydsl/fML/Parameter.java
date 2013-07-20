/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getWidget <em>Widget</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getEditionPattern <em>Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Widget</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.PRTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widget</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widget</em>' attribute.
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @see #setWidget(PRTYPE)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_Widget()
   * @model
   * @generated
   */
  PRTYPE getWidget();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getWidget <em>Widget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Widget</em>' attribute.
   * @see org.xtext.example.mydsl.fML.PRTYPE
   * @see #getWidget()
   * @generated
   */
  void setWidget(PRTYPE value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_EditionPattern()
   * @model
   * @generated
   */
  EditionPattern getEditionPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getEditionPattern <em>Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Edition Pattern</em>' reference.
   * @see #getEditionPattern()
   * @generated
   */
  void setEditionPattern(EditionPattern value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Parameter
