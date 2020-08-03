/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Image Asset Location Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getImageUri_java_lang_String_ <em>Image Uri java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.DockerImageAssetLocationBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core()
 * @model
 * @generated
 */
public interface DockerImageAssetLocationBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Uri java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Uri java lang String </em>' attribute.
	 * @see #setImageUri_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_ImageUri_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getImageUri_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetLocationBuilder_core#getImageUri_java_lang_String_ <em>Image Uri java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Uri java lang String </em>' attribute.
	 * @see #getImageUri_java_lang_String_()
	 * @generated
	 */
	void setImageUri_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #setRepositoryName_java_lang_String_(String)
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_RepositoryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getRepositoryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetLocationBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name java lang String </em>' attribute.
	 * @see #getRepositoryName_java_lang_String_()
	 * @generated
	 */
	void setRepositoryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.DockerImageAssetLocation"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.DockerImageAssetLocation" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetLocationBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetLocationBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getDockerImageAssetLocationBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.DockerImageAssetLocationBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DockerImageAssetLocationBuilder_core
