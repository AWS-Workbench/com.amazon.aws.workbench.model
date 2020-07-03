/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAutoSynth <em>Auto Synth</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getOutdir <em>Outdir</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getRuntimeInfo <em>Runtime Info</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackTraces <em>Stack Traces</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getTreeMetadata <em>Tree Metadata</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackbuilder <em>Stackbuilder</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder()
 * @model
 * @generated
 */
public interface AppBuilder extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Synth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Synth</em>' attribute.
	 * @see #setAutoSynth(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_AutoSynth()
	 * @model
	 * @generated
	 */
	Boolean getAutoSynth();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAutoSynth <em>Auto Synth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Synth</em>' attribute.
	 * @see #getAutoSynth()
	 * @generated
	 */
	void setAutoSynth(Boolean value);

	/**
	 * Returns the value of the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outdir</em>' attribute.
	 * @see #setOutdir(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_Outdir()
	 * @model
	 * @generated
	 */
	String getOutdir();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getOutdir <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outdir</em>' attribute.
	 * @see #getOutdir()
	 * @generated
	 */
	void setOutdir(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Info</em>' attribute.
	 * @see #setRuntimeInfo(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_RuntimeInfo()
	 * @model
	 * @generated
	 */
	Boolean getRuntimeInfo();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getRuntimeInfo <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Info</em>' attribute.
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	void setRuntimeInfo(Boolean value);

	/**
	 * Returns the value of the '<em><b>Stack Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Traces</em>' attribute.
	 * @see #setStackTraces(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_StackTraces()
	 * @model
	 * @generated
	 */
	Boolean getStackTraces();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getStackTraces <em>Stack Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Traces</em>' attribute.
	 * @see #getStackTraces()
	 * @generated
	 */
	void setStackTraces(Boolean value);

	/**
	 * Returns the value of the '<em><b>Tree Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Metadata</em>' attribute.
	 * @see #setTreeMetadata(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_TreeMetadata()
	 * @model
	 * @generated
	 */
	Boolean getTreeMetadata();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getTreeMetadata <em>Tree Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Metadata</em>' attribute.
	 * @see #getTreeMetadata()
	 * @generated
	 */
	void setTreeMetadata(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.App"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see #setGeneratedClassName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.App"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getGeneratedClassName <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Class Name</em>' attribute.
	 * @see #getGeneratedClassName()
	 * @generated
	 */
	void setGeneratedClassName(String value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.AppBuilder#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

	/**
	 * Returns the value of the '<em><b>Stackbuilder</b></em>' containment reference list.
	 * The list contents are of type {@link com.amazon.aws.workbench.model.awsworkbench.StackBuilder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stackbuilder</em>' containment reference list.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getAppBuilder_Stackbuilder()
	 * @model containment="true"
	 * @generated
	 */
	EList<StackBuilder> getStackbuilder();

} // AppBuilder
