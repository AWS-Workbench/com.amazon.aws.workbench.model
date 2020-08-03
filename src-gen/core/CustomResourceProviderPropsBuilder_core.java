/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Resource Provider Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getCodeDirectory_java_lang_String_ <em>Code Directory java lang String </em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getPolicyStatements_java_lang_Object_AsList <em>Policy Statements java lang Object As List</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.CustomResourceProviderPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core()
 * @model
 * @generated
 */
public interface CustomResourceProviderPropsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Directory java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Directory java lang String </em>' attribute.
	 * @see #setCodeDirectory_java_lang_String_(String)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_CodeDirectory_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCodeDirectory_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getCodeDirectory_java_lang_String_ <em>Code Directory java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Directory java lang String </em>' attribute.
	 * @see #getCodeDirectory_java_lang_String_()
	 * @generated
	 */
	void setCodeDirectory_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Runtime software amazon awscdk core Custom Resource Provider Runtime </b></em>' attribute.
	 * The literals are from the enumeration {@link core.CustomResourceProviderRuntime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>' attribute.
	 * @see core.CustomResourceProviderRuntime
	 * @see #setRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(CustomResourceProviderRuntime)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_Runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_()
	 * @model dataType="core.CustomResourceProviderRuntime"
	 * @generated
	 */
	CustomResourceProviderRuntime getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>' attribute.
	 * @see core.CustomResourceProviderRuntime
	 * @see #getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_()
	 * @generated
	 */
	void setRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_(CustomResourceProviderRuntime value);

	/**
	 * Returns the value of the '<em><b>Memory Size With Size software amazon awscdk core Size As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size With Size software amazon awscdk core Size As Reference</em>' attribute.
	 * @see #setMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference(String)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_MemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference()
	 * @model
	 * @generated
	 */
	String getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size With Size software amazon awscdk core Size As Reference</em>' attribute.
	 * @see #getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference()
	 * @generated
	 */
	void setMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Policy Statements java lang Object As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Statements java lang Object As List</em>' attribute.
	 * @see #setPolicyStatements_java_lang_Object_AsList(String)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_PolicyStatements_java_lang_Object_AsList()
	 * @model
	 * @generated
	 */
	String getPolicyStatements_java_lang_Object_AsList();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getPolicyStatements_java_lang_Object_AsList <em>Policy Statements java lang Object As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Statements java lang Object As List</em>' attribute.
	 * @see #getPolicyStatements_java_lang_Object_AsList()
	 * @generated
	 */
	void setPolicyStatements_java_lang_Object_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.CustomResourceProviderProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.CustomResourceProviderProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getCustomResourceProviderPropsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.CustomResourceProviderPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CustomResourceProviderPropsBuilder_core
