/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Stack Synthesizer Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.DefaultStackSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core()
 * @model
 * @generated
 */
public interface DefaultStackSynthesizerBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Publishing External Id java lang String </em>' attribute.
	 * @see #setAssetPublishingExternalId_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAssetPublishingExternalId_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Publishing External Id java lang String </em>' attribute.
	 * @see #getAssetPublishingExternalId_java_lang_String_()
	 * @generated
	 */
	void setAssetPublishingExternalId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Publishing Role Arn java lang String </em>' attribute.
	 * @see #setAssetPublishingRoleArn_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getAssetPublishingRoleArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Publishing Role Arn java lang String </em>' attribute.
	 * @see #getAssetPublishingRoleArn_java_lang_String_()
	 * @generated
	 */
	void setAssetPublishingRoleArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Formation Execution Role java lang String </em>' attribute.
	 * @see #setCloudFormationExecutionRole_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getCloudFormationExecutionRole_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Formation Execution Role java lang String </em>' attribute.
	 * @see #getCloudFormationExecutionRole_java_lang_String_()
	 * @generated
	 */
	void setCloudFormationExecutionRole_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Role Arn java lang String </em>' attribute.
	 * @see #setDeployRoleArn_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDeployRoleArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Role Arn java lang String </em>' attribute.
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 */
	void setDeployRoleArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Assets Bucket Name java lang String </em>' attribute.
	 * @see #setFileAssetsBucketName_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFileAssetsBucketName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Assets Bucket Name java lang String </em>' attribute.
	 * @see #getFileAssetsBucketName_java_lang_String_()
	 * @generated
	 */
	void setFileAssetsBucketName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Assets Repository Name java lang String </em>' attribute.
	 * @see #setImageAssetsRepositoryName_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getImageAssetsRepositoryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Assets Repository Name java lang String </em>' attribute.
	 * @see #getImageAssetsRepositoryName_java_lang_String_()
	 * @generated
	 */
	void setImageAssetsRepositoryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Qualifier java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier java lang String </em>' attribute.
	 * @see #setQualifier_java_lang_String_(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getQualifier_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier java lang String </em>' attribute.
	 * @see #getQualifier_java_lang_String_()
	 * @generated
	 */
	void setQualifier_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.DefaultStackSynthesizer"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.DefaultStackSynthesizer" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getDefaultStackSynthesizerBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.DefaultStackSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DefaultStackSynthesizerBuilder_core
