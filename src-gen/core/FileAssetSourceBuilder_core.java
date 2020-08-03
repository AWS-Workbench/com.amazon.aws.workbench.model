/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Asset Source Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.FileAssetSourceBuilder_core#getFileName_java_lang_String_ <em>File Name java lang String </em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getPackaging_software_amazon_awscdk_core_FileAssetPackaging_ <em>Packaging software amazon awscdk core File Asset Packaging </em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.FileAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getFileAssetSourceBuilder_core()
 * @model
 * @generated
 */
public interface FileAssetSourceBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name java lang String </em>' attribute.
	 * @see #setFileName_java_lang_String_(String)
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_FileName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getFileName_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getFileName_java_lang_String_ <em>File Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name java lang String </em>' attribute.
	 * @see #getFileName_java_lang_String_()
	 * @generated
	 */
	void setFileName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Packaging software amazon awscdk core File Asset Packaging </b></em>' attribute.
	 * The literals are from the enumeration {@link core.FileAssetPackaging}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging software amazon awscdk core File Asset Packaging </em>' attribute.
	 * @see core.FileAssetPackaging
	 * @see #setPackaging_software_amazon_awscdk_core_FileAssetPackaging_(FileAssetPackaging)
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_Packaging_software_amazon_awscdk_core_FileAssetPackaging_()
	 * @model dataType="core.FileAssetPackaging"
	 * @generated
	 */
	FileAssetPackaging getPackaging_software_amazon_awscdk_core_FileAssetPackaging_();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getPackaging_software_amazon_awscdk_core_FileAssetPackaging_ <em>Packaging software amazon awscdk core File Asset Packaging </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging software amazon awscdk core File Asset Packaging </em>' attribute.
	 * @see core.FileAssetPackaging
	 * @see #getPackaging_software_amazon_awscdk_core_FileAssetPackaging_()
	 * @generated
	 */
	void setPackaging_software_amazon_awscdk_core_FileAssetPackaging_(FileAssetPackaging value);

	/**
	 * Returns the value of the '<em><b>Source Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Hash java lang String </em>' attribute.
	 * @see #setSourceHash_java_lang_String_(String)
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_SourceHash_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getSourceHash_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Hash java lang String </em>' attribute.
	 * @see #getSourceHash_java_lang_String_()
	 * @generated
	 */
	void setSourceHash_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.FileAssetSource"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.FileAssetSource" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getFileAssetSourceBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.FileAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FileAssetSourceBuilder_core
