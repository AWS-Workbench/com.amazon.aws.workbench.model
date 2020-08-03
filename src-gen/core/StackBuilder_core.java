/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.StackBuilder_core#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link core.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}</li>
 *   <li>{@link core.StackBuilder_core#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}</li>
 *   <li>{@link core.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}</li>
 *   <li>{@link core.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.StackBuilder_core#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}</li>
 *   <li>{@link core.StackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.StackBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.StackBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getStackBuilder_core()
 * @model
 * @generated
 */
public interface StackBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description java lang String </em>' attribute.
	 * @see #setDescription_java_lang_String_(String)
	 * @see core.CorePackage#getStackBuilder_core_Description_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDescription_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getDescription_java_lang_String_ <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description java lang String </em>' attribute.
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 */
	void setDescription_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env With Environment software amazon awscdk core Environment As Reference</em>' attribute.
	 * @see #setEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(String)
	 * @see core.CorePackage#getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @model
	 * @generated
	 */
	String getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env With Environment software amazon awscdk core Environment As Reference</em>' attribute.
	 * @see #getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @generated
	 */
	void setEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Stack Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Name java lang String </em>' attribute.
	 * @see #setStackName_java_lang_String_(String)
	 * @see core.CorePackage#getStackBuilder_core_StackName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getStackName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Name java lang String </em>' attribute.
	 * @see #getStackName_java_lang_String_()
	 * @generated
	 */
	void setStackName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>' attribute.
	 * @see #setSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(String)
	 * @see core.CorePackage#getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @model
	 * @generated
	 */
	String getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>' attribute.
	 * @see #getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @generated
	 */
	void setSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags java lang String java lang String As Map</em>' attribute.
	 * @see #setTags_java_lang_String__java_lang_String_AsMap(String)
	 * @see core.CorePackage#getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getTags_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags java lang String java lang String As Map</em>' attribute.
	 * @see #getTags_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setTags_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Termination Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termination Protection java lang Boolean </em>' attribute.
	 * @see #setTerminationProtection_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getStackBuilder_core_TerminationProtection_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getTerminationProtection_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termination Protection java lang Boolean </em>' attribute.
	 * @see #getTerminationProtection_java_lang_Boolean_()
	 * @generated
	 */
	void setTerminationProtection_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.Stack"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getStackBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.Stack" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getStackBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getStackBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getStackBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // StackBuilder_core
