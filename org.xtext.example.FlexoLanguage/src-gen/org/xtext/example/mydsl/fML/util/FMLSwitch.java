/**
 */
package org.xtext.example.mydsl.fML.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.fML.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLPackage
 * @generated
 */
public class FMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FMLPackage.VIEW_DEF:
      {
        ViewDef viewDef = (ViewDef)theEObject;
        T result = caseViewDef(viewDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.VIRTUAL_MODEL:
      {
        VirtualModel virtualModel = (VirtualModel)theEObject;
        T result = caseVirtualModel(virtualModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.MODEL_SLOT:
      {
        ModelSlot modelSlot = (ModelSlot)theEObject;
        T result = caseModelSlot(modelSlot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.EDITION_PATTERN:
      {
        EditionPattern editionPattern = (EditionPattern)theEObject;
        T result = caseEditionPattern(editionPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.PATTERN_ROLE:
      {
        PatternRole patternRole = (PatternRole)theEObject;
        T result = casePatternRole(patternRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.EDITION_SCHEME:
      {
        EditionScheme editionScheme = (EditionScheme)theEObject;
        T result = caseEditionScheme(editionScheme);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.EDITION_ACTION:
      {
        EditionAction editionAction = (EditionAction)theEObject;
        T result = caseEditionAction(editionAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.BUILT_IN_ACTION:
      {
        BuiltInAction builtInAction = (BuiltInAction)theEObject;
        T result = caseBuiltInAction(builtInAction);
        if (result == null) result = caseEditionAction(builtInAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.DECLARE_PATTERN_ROLE:
      {
        DeclarePatternRole declarePatternRole = (DeclarePatternRole)theEObject;
        T result = caseDeclarePatternRole(declarePatternRole);
        if (result == null) result = caseBuiltInAction(declarePatternRole);
        if (result == null) result = caseEditionAction(declarePatternRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.DELETE_ACTION:
      {
        DeleteAction deleteAction = (DeleteAction)theEObject;
        T result = caseDeleteAction(deleteAction);
        if (result == null) result = caseBuiltInAction(deleteAction);
        if (result == null) result = caseEditionAction(deleteAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL:
      {
        AddEMFObjectIndividual addEMFObjectIndividual = (AddEMFObjectIndividual)theEObject;
        T result = caseAddEMFObjectIndividual(addEMFObjectIndividual);
        if (result == null) result = caseBuiltInAction(addEMFObjectIndividual);
        if (result == null) result = caseEditionAction(addEMFObjectIndividual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewDef(ViewDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualModel(VirtualModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Slot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Slot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelSlot(ModelSlot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edition Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edition Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditionPattern(EditionPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternRole(PatternRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edition Scheme</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edition Scheme</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditionScheme(EditionScheme object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Edition Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Edition Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEditionAction(EditionAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInAction(BuiltInAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declare Pattern Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declare Pattern Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarePatternRole(DeclarePatternRole object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteAction(DeleteAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add EMF Object Individual</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add EMF Object Individual</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddEMFObjectIndividual(AddEMFObjectIndividual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FMLSwitch
