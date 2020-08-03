/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synthesis Options Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getSkipValidation_java_lang_Boolean_ <em>Skip Validation java lang Boolean </em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.SynthesisOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getSynthesisOptionsBuilder_core()
 * @model
 * @generated
 */
public interface SynthesisOptionsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Outdir java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outdir java lang String </em>' attribute.
	 * @see #setOutdir_java_lang_String_(String)
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_Outdir_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getOutdir_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdir java lang String </em>' attribute.
	 * @see #getOutdir_java_lang_String_()
	 * @generated
	 */
	void setOutdir_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Skip Validation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Validation java lang Boolean </em>' attribute.
	 * @see #setSkipValidation_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_SkipValidation_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getSkipValidation_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getSkipValidation_java_lang_Boolean_ <em>Skip Validation java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Validation java lang Boolean </em>' attribute.
	 * @see #getSkipValidation_java_lang_Boolean_()
	 * @generated
	 */
	void setSkipValidation_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>' attribute.
	 * @see #setRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference(String)
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_RuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference()
	 * @model
	 * @generated
	 */
	String getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>' attribute.
	 * @see #getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference()
	 * @generated
	 */
	void setRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.SynthesisOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.SynthesisOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getSynthesisOptionsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.SynthesisOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SynthesisOptionsBuilder_core
