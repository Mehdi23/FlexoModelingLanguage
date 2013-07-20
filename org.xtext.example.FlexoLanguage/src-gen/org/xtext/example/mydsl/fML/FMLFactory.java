/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLPackage
 * @generated
 */
public interface FMLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FMLFactory eINSTANCE = org.xtext.example.mydsl.fML.impl.FMLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>View Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Def</em>'.
   * @generated
   */
  ViewDef createViewDef();

  /**
   * Returns a new object of class '<em>Virtual Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virtual Model</em>'.
   * @generated
   */
  VirtualModel createVirtualModel();

  /**
   * Returns a new object of class '<em>Model Slot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Slot</em>'.
   * @generated
   */
  ModelSlot createModelSlot();

  /**
   * Returns a new object of class '<em>Edition Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edition Pattern</em>'.
   * @generated
   */
  EditionPattern createEditionPattern();

  /**
   * Returns a new object of class '<em>Pattern Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Role</em>'.
   * @generated
   */
  PatternRole createPatternRole();

  /**
   * Returns a new object of class '<em>Edition Scheme</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edition Scheme</em>'.
   * @generated
   */
  EditionScheme createEditionScheme();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Edition Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edition Action</em>'.
   * @generated
   */
  EditionAction createEditionAction();

  /**
   * Returns a new object of class '<em>Built In Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Action</em>'.
   * @generated
   */
  BuiltInAction createBuiltInAction();

  /**
   * Returns a new object of class '<em>Declare Pattern Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declare Pattern Role</em>'.
   * @generated
   */
  DeclarePatternRole createDeclarePatternRole();

  /**
   * Returns a new object of class '<em>Delete Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete Action</em>'.
   * @generated
   */
  DeleteAction createDeleteAction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FMLPackage getFMLPackage();

} //FMLFactory
