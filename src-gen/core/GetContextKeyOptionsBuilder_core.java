/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Context Key Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getProvider_java_lang_String_ <em>Provider java lang String </em>}</li>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}</li>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.GetContextKeyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core()
 * @model
 * @generated
 */
public interface GetContextKeyOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider java lang String </em>' attribute.
	 * @see #setProvider_java_lang_String_(String)
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_Provider_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getProvider_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.GetContextKeyOptionsBuilder_core#getProvider_java_lang_String_ <em>Provider java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider java lang String </em>' attribute.
	 * @see #getProvider_java_lang_String_()
	 * @generated
	 */
	void setProvider_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props java lang String java lang Object As Map</em>' attribute.
	 * @see #setProps_java_lang_String__java_lang_Object_AsMap(String)
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getProps_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link core.GetContextKeyOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Props java lang String java lang Object As Map</em>' attribute.
	 * @see #getProps_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setProps_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.GetContextKeyOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.GetContextKeyOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.GetContextKeyOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.GetContextKeyOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see core.CorePackage#getGetContextKeyOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.GetContextKeyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // GetContextKeyOptionsBuilder_core
