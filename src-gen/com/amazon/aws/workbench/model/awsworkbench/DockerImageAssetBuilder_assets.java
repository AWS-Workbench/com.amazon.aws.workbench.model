/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Image Asset Builder assets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getFollow_software_amazon_awscdk_assets_FollowMode_ <em>Follow software amazon awscdk assets Follow Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getBuildArgs_java_lang_String__java_lang_String_AsMap <em>Build Args java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getFile_java_lang_String_ <em>File java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getTarget_java_lang_String_ <em>Target java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getDirectory_java_lang_String_ <em>Directory java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets()
 * @model
 * @generated
 */
public interface DockerImageAssetBuilder_assets extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude java lang String As List</em>' attribute.
	 * @see #setExclude_java_lang_String_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_Exclude_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getExclude_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude java lang String As List</em>' attribute.
	 * @see #getExclude_java_lang_String_AsList()
	 * @generated
	 */
	void setExclude_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Follow software amazon awscdk assets Follow Mode </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.FollowMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follow software amazon awscdk assets Follow Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FollowMode
	 * @see #setFollow_software_amazon_awscdk_assets_FollowMode_(FollowMode)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_Follow_software_amazon_awscdk_assets_FollowMode_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.FollowMode"
	 * @generated
	 */
	FollowMode getFollow_software_amazon_awscdk_assets_FollowMode_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getFollow_software_amazon_awscdk_assets_FollowMode_ <em>Follow software amazon awscdk assets Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follow software amazon awscdk assets Follow Mode </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.FollowMode
	 * @see #getFollow_software_amazon_awscdk_assets_FollowMode_()
	 * @generated
	 */
	void setFollow_software_amazon_awscdk_assets_FollowMode_(FollowMode value);

	/**
	 * Returns the value of the '<em><b>Extra Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Hash java lang String </em>' attribute.
	 * @see #setExtraHash_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_ExtraHash_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getExtraHash_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Hash java lang String </em>' attribute.
	 * @see #getExtraHash_java_lang_String_()
	 * @generated
	 */
	void setExtraHash_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Build Args java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Args java lang String java lang String As Map</em>' attribute.
	 * @see #setBuildArgs_java_lang_String__java_lang_String_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_BuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getBuildArgs_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getBuildArgs_java_lang_String__java_lang_String_AsMap <em>Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Args java lang String java lang String As Map</em>' attribute.
	 * @see #getBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setBuildArgs_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>File java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File java lang String </em>' attribute.
	 * @see #setFile_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_File_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFile_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getFile_java_lang_String_ <em>File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File java lang String </em>' attribute.
	 * @see #getFile_java_lang_String_()
	 * @generated
	 */
	void setFile_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #setRepositoryName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_RepositoryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRepositoryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #getRepositoryName_java_lang_String_()
	 * @generated
	 */
	void setRepositoryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Target java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target java lang String </em>' attribute.
	 * @see #setTarget_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_Target_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTarget_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getTarget_java_lang_String_ <em>Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target java lang String </em>' attribute.
	 * @see #getTarget_java_lang_String_()
	 * @generated
	 */
	void setTarget_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Directory java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory java lang String </em>' attribute.
	 * @see #setDirectory_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_Directory_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDirectory_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getDirectory_java_lang_String_ <em>Directory java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory java lang String </em>' attribute.
	 * @see #getDirectory_java_lang_String_()
	 * @generated
	 */
	void setDirectory_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecr.assets.DockerImageAsset"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecr.assets.DockerImageAsset" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getDockerImageAssetBuilder_assets_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.DockerImageAssetBuilder_assets#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DockerImageAssetBuilder_assets
