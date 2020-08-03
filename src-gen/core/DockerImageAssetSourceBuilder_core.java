/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Image Asset Source Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getDirectoryName_java_lang_String_ <em>Directory Name java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildArgs_java_lang_String__java_lang_String_AsMap <em>Docker Build Args java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildTarget_java_lang_String_ <em>Docker Build Target java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getDockerFile_java_lang_String_ <em>Docker File java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.DockerImageAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core()
 * @model
 * @generated
 */
public interface DockerImageAssetSourceBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Directory Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Name java lang String </em>' attribute.
	 * @see #setDirectoryName_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_DirectoryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDirectoryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getDirectoryName_java_lang_String_ <em>Directory Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Name java lang String </em>' attribute.
	 * @see #getDirectoryName_java_lang_String_()
	 * @generated
	 */
	void setDirectoryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Source Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Hash java lang String </em>' attribute.
	 * @see #setSourceHash_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_SourceHash_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSourceHash_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Hash java lang String </em>' attribute.
	 * @see #getSourceHash_java_lang_String_()
	 * @generated
	 */
	void setSourceHash_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Docker Build Args java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Build Args java lang String java lang String As Map</em>' attribute.
	 * @see #setDockerBuildArgs_java_lang_String__java_lang_String_AsMap(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_DockerBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getDockerBuildArgs_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildArgs_java_lang_String__java_lang_String_AsMap <em>Docker Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Build Args java lang String java lang String As Map</em>' attribute.
	 * @see #getDockerBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setDockerBuildArgs_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Docker Build Target java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Build Target java lang String </em>' attribute.
	 * @see #setDockerBuildTarget_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_DockerBuildTarget_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDockerBuildTarget_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildTarget_java_lang_String_ <em>Docker Build Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Build Target java lang String </em>' attribute.
	 * @see #getDockerBuildTarget_java_lang_String_()
	 * @generated
	 */
	void setDockerBuildTarget_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Docker File java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker File java lang String </em>' attribute.
	 * @see #setDockerFile_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_DockerFile_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDockerFile_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getDockerFile_java_lang_String_ <em>Docker File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker File java lang String </em>' attribute.
	 * @see #getDockerFile_java_lang_String_()
	 * @generated
	 */
	void setDockerFile_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #setRepositoryName_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_RepositoryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRepositoryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #getRepositoryName_java_lang_String_()
	 * @generated
	 */
	void setRepositoryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.DockerImageAssetSource"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.DockerImageAssetSource" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getDockerImageAssetSourceBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DockerImageAssetSourceBuilder_core
