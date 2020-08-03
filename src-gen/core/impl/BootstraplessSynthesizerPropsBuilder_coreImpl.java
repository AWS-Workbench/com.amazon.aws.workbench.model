/**
 */
package core.impl;

import core.BootstraplessSynthesizerPropsBuilder_core;
import core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bootstrapless Synthesizer Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getCloudFormationExecutionRoleArn_java_lang_String_ <em>Cloud Formation Execution Role Arn java lang String </em>}</li>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}</li>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BootstraplessSynthesizerPropsBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements BootstraplessSynthesizerPropsBuilder_core {
	/**
	 * The default value of the '{@link #getCloudFormationExecutionRoleArn_java_lang_String_() <em>Cloud Formation Execution Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFormationExecutionRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudFormationExecutionRoleArn_java_lang_String_() <em>Cloud Formation Execution Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFormationExecutionRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cloudFormationExecutionRoleArn_java_lang_String_ = CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployRoleArn_java_lang_String_() <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployRoleArn_java_lang_String_() <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String deployRoleArn_java_lang_String_ = DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.BootstraplessSynthesizerProps";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BootstraplessSynthesizerPropsBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudFormationExecutionRoleArn_java_lang_String_() {
		return cloudFormationExecutionRoleArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudFormationExecutionRoleArn_java_lang_String_(
			String newCloudFormationExecutionRoleArn_java_lang_String_) {
		String oldCloudFormationExecutionRoleArn_java_lang_String_ = cloudFormationExecutionRoleArn_java_lang_String_;
		cloudFormationExecutionRoleArn_java_lang_String_ = newCloudFormationExecutionRoleArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_,
					oldCloudFormationExecutionRoleArn_java_lang_String_,
					cloudFormationExecutionRoleArn_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployRoleArn_java_lang_String_() {
		return deployRoleArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployRoleArn_java_lang_String_(String newDeployRoleArn_java_lang_String_) {
		String oldDeployRoleArn_java_lang_String_ = deployRoleArn_java_lang_String_;
		deployRoleArn_java_lang_String_ = newDeployRoleArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_,
					oldDeployRoleArn_java_lang_String_, deployRoleArn_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_:
			return getCloudFormationExecutionRoleArn_java_lang_String_();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			return getDeployRoleArn_java_lang_String_();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_:
			setCloudFormationExecutionRoleArn_java_lang_String_((String) newValue);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			setDeployRoleArn_java_lang_String_((String) newValue);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_:
			setCloudFormationExecutionRoleArn_java_lang_String_(
					CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			setDeployRoleArn_java_lang_String_(DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_:
			return CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT == null
					? cloudFormationExecutionRoleArn_java_lang_String_ != null
					: !CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT
							.equals(cloudFormationExecutionRoleArn_java_lang_String_);
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			return DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT == null ? deployRoleArn_java_lang_String_ != null
					: !DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT.equals(deployRoleArn_java_lang_String_);
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cloudFormationExecutionRoleArn_java_lang_String_: ");
		result.append(cloudFormationExecutionRoleArn_java_lang_String_);
		result.append(", deployRoleArn_java_lang_String_: ");
		result.append(deployRoleArn_java_lang_String_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //BootstraplessSynthesizerPropsBuilder_coreImpl
