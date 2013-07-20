/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionPattern#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionPattern#getSuperEditionPattern <em>Super Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionPattern#getPatternRoles <em>Pattern Roles</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.EditionPattern#getEditionSchemes <em>Edition Schemes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionPattern()
 * @model
 * @generated
 */
public interface EditionPattern extends EObject
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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionPattern_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.EditionPattern#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Edition Pattern</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Edition Pattern</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Edition Pattern</em>' reference.
   * @see #setSuperEditionPattern(EditionPattern)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionPattern_SuperEditionPattern()
   * @model
   * @generated
   */
  EditionPattern getSuperEditionPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.EditionPattern#getSuperEditionPattern <em>Super Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Edition Pattern</em>' reference.
   * @see #getSuperEditionPattern()
   * @generated
   */
  void setSuperEditionPattern(EditionPattern value);

  /**
   * Returns the value of the '<em><b>Pattern Roles</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.PatternRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Roles</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionPattern_PatternRoles()
   * @model containment="true"
   * @generated
   */
  EList<PatternRole> getPatternRoles();

  /**
   * Returns the value of the '<em><b>Edition Schemes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.EditionScheme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edition Schemes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edition Schemes</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionPattern_EditionSchemes()
   * @model containment="true"
   * @generated
   */
  EList<EditionScheme> getEditionSchemes();

} // EditionPattern
