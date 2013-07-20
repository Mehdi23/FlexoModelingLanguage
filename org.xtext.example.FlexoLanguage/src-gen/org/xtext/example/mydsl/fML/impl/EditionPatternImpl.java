/**
 */
package org.xtext.example.mydsl.fML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.fML.EditionPattern;
import org.xtext.example.mydsl.fML.EditionScheme;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.PatternRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edition Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl#getSuperEditionPattern <em>Super Edition Pattern</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl#getPatternRoles <em>Pattern Roles</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.EditionPatternImpl#getEditionSchemes <em>Edition Schemes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EditionPatternImpl extends MinimalEObjectImpl.Container implements EditionPattern
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperEditionPattern() <em>Super Edition Pattern</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperEditionPattern()
   * @generated
   * @ordered
   */
  protected EditionPattern superEditionPattern;

  /**
   * The cached value of the '{@link #getPatternRoles() <em>Pattern Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternRoles()
   * @generated
   * @ordered
   */
  protected EList<PatternRole> patternRoles;

  /**
   * The cached value of the '{@link #getEditionSchemes() <em>Edition Schemes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEditionSchemes()
   * @generated
   * @ordered
   */
  protected EList<EditionScheme> editionSchemes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EditionPatternImpl()
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
    return FMLPackage.Literals.EDITION_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.EDITION_PATTERN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern getSuperEditionPattern()
  {
    if (superEditionPattern != null && superEditionPattern.eIsProxy())
    {
      InternalEObject oldSuperEditionPattern = (InternalEObject)superEditionPattern;
      superEditionPattern = (EditionPattern)eResolveProxy(oldSuperEditionPattern);
      if (superEditionPattern != oldSuperEditionPattern)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN, oldSuperEditionPattern, superEditionPattern));
      }
    }
    return superEditionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionPattern basicGetSuperEditionPattern()
  {
    return superEditionPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperEditionPattern(EditionPattern newSuperEditionPattern)
  {
    EditionPattern oldSuperEditionPattern = superEditionPattern;
    superEditionPattern = newSuperEditionPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN, oldSuperEditionPattern, superEditionPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PatternRole> getPatternRoles()
  {
    if (patternRoles == null)
    {
      patternRoles = new EObjectContainmentEList<PatternRole>(PatternRole.class, this, FMLPackage.EDITION_PATTERN__PATTERN_ROLES);
    }
    return patternRoles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EditionScheme> getEditionSchemes()
  {
    if (editionSchemes == null)
    {
      editionSchemes = new EObjectContainmentEList<EditionScheme>(EditionScheme.class, this, FMLPackage.EDITION_PATTERN__EDITION_SCHEMES);
    }
    return editionSchemes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FMLPackage.EDITION_PATTERN__PATTERN_ROLES:
        return ((InternalEList<?>)getPatternRoles()).basicRemove(otherEnd, msgs);
      case FMLPackage.EDITION_PATTERN__EDITION_SCHEMES:
        return ((InternalEList<?>)getEditionSchemes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FMLPackage.EDITION_PATTERN__NAME:
        return getName();
      case FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN:
        if (resolve) return getSuperEditionPattern();
        return basicGetSuperEditionPattern();
      case FMLPackage.EDITION_PATTERN__PATTERN_ROLES:
        return getPatternRoles();
      case FMLPackage.EDITION_PATTERN__EDITION_SCHEMES:
        return getEditionSchemes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.EDITION_PATTERN__NAME:
        setName((String)newValue);
        return;
      case FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN:
        setSuperEditionPattern((EditionPattern)newValue);
        return;
      case FMLPackage.EDITION_PATTERN__PATTERN_ROLES:
        getPatternRoles().clear();
        getPatternRoles().addAll((Collection<? extends PatternRole>)newValue);
        return;
      case FMLPackage.EDITION_PATTERN__EDITION_SCHEMES:
        getEditionSchemes().clear();
        getEditionSchemes().addAll((Collection<? extends EditionScheme>)newValue);
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
      case FMLPackage.EDITION_PATTERN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN:
        setSuperEditionPattern((EditionPattern)null);
        return;
      case FMLPackage.EDITION_PATTERN__PATTERN_ROLES:
        getPatternRoles().clear();
        return;
      case FMLPackage.EDITION_PATTERN__EDITION_SCHEMES:
        getEditionSchemes().clear();
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
      case FMLPackage.EDITION_PATTERN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FMLPackage.EDITION_PATTERN__SUPER_EDITION_PATTERN:
        return superEditionPattern != null;
      case FMLPackage.EDITION_PATTERN__PATTERN_ROLES:
        return patternRoles != null && !patternRoles.isEmpty();
      case FMLPackage.EDITION_PATTERN__EDITION_SCHEMES:
        return editionSchemes != null && !editionSchemes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EditionPatternImpl
