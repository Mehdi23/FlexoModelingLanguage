/**
 */
package org.xtext.example.mydsl.fML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edition Scheme Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLPackage#getEditionSchemeType()
 * @model
 * @generated
 */
public enum EditionSchemeType implements Enumerator
{
  /**
   * The '<em><b>Creation Scheme</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CREATION_SCHEME_VALUE
   * @generated
   * @ordered
   */
  CREATION_SCHEME(0, "creationScheme", "CreationScheme"),

  /**
   * The '<em><b>Deletion Scheme</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETION_SCHEME_VALUE
   * @generated
   * @ordered
   */
  DELETION_SCHEME(1, "deletionScheme", "DeletionScheme"),

  /**
   * The '<em><b>Action Scheme</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ACTION_SCHEME_VALUE
   * @generated
   * @ordered
   */
  ACTION_SCHEME(2, "actionScheme", "ActionScheme"),

  /**
   * The '<em><b>Cloning Scheme</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLONING_SCHEME_VALUE
   * @generated
   * @ordered
   */
  CLONING_SCHEME(3, "cloningScheme", "CloningScheme");

  /**
   * The '<em><b>Creation Scheme</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Creation Scheme</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CREATION_SCHEME
   * @model name="creationScheme" literal="CreationScheme"
   * @generated
   * @ordered
   */
  public static final int CREATION_SCHEME_VALUE = 0;

  /**
   * The '<em><b>Deletion Scheme</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Deletion Scheme</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETION_SCHEME
   * @model name="deletionScheme" literal="DeletionScheme"
   * @generated
   * @ordered
   */
  public static final int DELETION_SCHEME_VALUE = 1;

  /**
   * The '<em><b>Action Scheme</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Action Scheme</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ACTION_SCHEME
   * @model name="actionScheme" literal="ActionScheme"
   * @generated
   * @ordered
   */
  public static final int ACTION_SCHEME_VALUE = 2;

  /**
   * The '<em><b>Cloning Scheme</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cloning Scheme</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLONING_SCHEME
   * @model name="cloningScheme" literal="CloningScheme"
   * @generated
   * @ordered
   */
  public static final int CLONING_SCHEME_VALUE = 3;

  /**
   * An array of all the '<em><b>Edition Scheme Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EditionSchemeType[] VALUES_ARRAY =
    new EditionSchemeType[]
    {
      CREATION_SCHEME,
      DELETION_SCHEME,
      ACTION_SCHEME,
      CLONING_SCHEME,
    };

  /**
   * A public read-only list of all the '<em><b>Edition Scheme Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EditionSchemeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Edition Scheme Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditionSchemeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EditionSchemeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edition Scheme Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditionSchemeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EditionSchemeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edition Scheme Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditionSchemeType get(int value)
  {
    switch (value)
    {
      case CREATION_SCHEME_VALUE: return CREATION_SCHEME;
      case DELETION_SCHEME_VALUE: return DELETION_SCHEME;
      case ACTION_SCHEME_VALUE: return ACTION_SCHEME;
      case CLONING_SCHEME_VALUE: return CLONING_SCHEME;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EditionSchemeType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EditionSchemeType
