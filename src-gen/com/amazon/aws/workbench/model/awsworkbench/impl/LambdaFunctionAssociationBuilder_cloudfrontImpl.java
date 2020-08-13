/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LambdaEdgeEventType;
import com.amazon.aws.workbench.model.awsworkbench.LambdaFunctionAssociationBuilder_cloudfront;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Function Association Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ <em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference <em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LambdaFunctionAssociationBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LambdaFunctionAssociationBuilder_cloudfrontImpl extends ServiceResourcesImpl
		implements LambdaFunctionAssociationBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_() <em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_()
	 * @generated
	 * @ordered
	 */
	protected static final LambdaEdgeEventType EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE__EDEFAULT = LambdaEdgeEventType.ORIGIN_REQUEST;

	/**
	 * The cached value of the '{@link #getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_() <em>Event Type software amazon awscdk services cloudfront Lambda Edge Event Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_()
	 * @generated
	 * @ordered
	 */
	protected LambdaEdgeEventType eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ = EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference() <em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference() <em>Lambda Function With IVersion software amazon awscdk services lambda IVersion As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference = LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation";

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
	protected LambdaFunctionAssociationBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LambdaEdgeEventType getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_() {
		return eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_(
			LambdaEdgeEventType newEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_) {
		LambdaEdgeEventType oldEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ = eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_;
		eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ = newEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ == null
				? EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE__EDEFAULT
				: newEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_,
					oldEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_,
					eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference() {
		return lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference(
			String newLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference) {
		String oldLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference = lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference;
		lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference = newLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE,
					oldLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference,
					lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference));
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
					AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier,
					identifier));
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
					AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_:
			return getEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE:
			return getLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_:
			setEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_(
					(LambdaEdgeEventType) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE:
			setLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_:
			setEventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_(
					EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE__EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE:
			setLambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference(
					LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE_:
			return eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_ != EVENT_TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_LAMBDA_EDGE_EVENT_TYPE__EDEFAULT;
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE:
			return LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE_EDEFAULT == null
					? lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference != null
					: !LAMBDA_FUNCTION_WITH_IVERSION_SOFTWARE_AMAZON_AWSCDK_SERVICES_LAMBDA_IVERSION_AS_REFERENCE_EDEFAULT
							.equals(lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference);
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LAMBDA_FUNCTION_ASSOCIATION_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
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
		result.append(" (eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_: ");
		result.append(eventType_software_amazon_awscdk_services_cloudfront_LambdaEdgeEventType_);
		result.append(", lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference: ");
		result.append(lambdaFunctionWithIVersion_software_amazon_awscdk_services_lambda_IVersion_AsReference);
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

} //LambdaFunctionAssociationBuilder_cloudfrontImpl
