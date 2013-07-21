/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.AddEMFObjectIndividual;
import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.ModelSlot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add EMF Object Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.AddEMFObjectIndividualImpl#getEditionPattern <em>Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.AddEMFObjectIndividualImpl#getModelSlot <em>Model Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddEMFObjectIndividualImpl extends BuiltInActionImpl implements AddEMFObjectIndividual
{
  /**
   * The cached value of the '{@link #getEditionPattern() <em>Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionPattern()
   * @generated
   * @ordered
   */
  protected EditionPattern editionPattern;

  /**
   * The cached value of the '{@link #getModelSlot() <em>Model Slot</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelSlot()
   * @generated
   * @ordered
   */
  protected ModelSlot modelSlot;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddEMFObjectIndividualImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FMLPackage.Literals.ADD_EMF_OBJECT_INDIVIDUAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern getEditionPattern()
  {
    if (editionPattern != null && editionPattern.eIsProxy())
    {
      InternalEObject oldEditionPattern = (InternalEObject)editionPattern;
      editionPattern = (EditionPattern)eResolveProxy(oldEditionPattern);
      if (editionPattern != oldEditionPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN, oldEditionPattern, editionPattern));
      }
    }
    return editionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern basicGetEditionPattern()
  {
    return editionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEditionPattern(EditionPattern newEditionPattern)
  {
    EditionPattern oldEditionPattern = editionPattern;
    editionPattern = newEditionPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN, oldEditionPattern, editionPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSlot getModelSlot()
  {
    if (modelSlot != null && modelSlot.eIsProxy())
    {
      InternalEObject oldModelSlot = (InternalEObject)modelSlot;
      modelSlot = (ModelSlot)eResolveProxy(oldModelSlot);
      if (modelSlot != oldModelSlot)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT, oldModelSlot, modelSlot));
      }
    }
    return modelSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelSlot basicGetModelSlot()
  {
    return modelSlot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelSlot(ModelSlot newModelSlot)
  {
    ModelSlot oldModelSlot = modelSlot;
    modelSlot = newModelSlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT, oldModelSlot, modelSlot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN:
        if (resolve) return getEditionPattern();
        return basicGetEditionPattern();
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT:
        if (resolve) return getModelSlot();
        return basicGetModelSlot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN:
        setEditionPattern((EditionPattern)newValue);
        return;
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT:
        setModelSlot((ModelSlot)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN:
        setEditionPattern((EditionPattern)null);
        return;
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT:
        setModelSlot((ModelSlot)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__EDITION_PATTERN:
        return editionPattern != null;
      case FMLPackage.ADD_EMF_OBJECT_INDIVIDUAL__MODEL_SLOT:
        return modelSlot != null;
    }
    return super.eIsSet(featureID);
  }

} //AddEMFObjectIndividualImpl
