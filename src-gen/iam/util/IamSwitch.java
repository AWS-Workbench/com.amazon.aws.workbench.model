/**
 */
package iam.util;

import iam.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iam.IamPackage
 * @generated
 */
public class IamSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IamPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IamSwitch() {
		if (modelPackage == null) {
			modelPackage = IamPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case IamPackage.ROLE_PROPS_BUILDER_IAM: {
			RolePropsBuilder_iam rolePropsBuilder_iam = (RolePropsBuilder_iam) theEObject;
			T result = caseRolePropsBuilder_iam(rolePropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.UNKNOWN_PRINCIPAL_PROPS_BUILDER_IAM: {
			UnknownPrincipalPropsBuilder_iam unknownPrincipalPropsBuilder_iam = (UnknownPrincipalPropsBuilder_iam) theEObject;
			T result = caseUnknownPrincipalPropsBuilder_iam(unknownPrincipalPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_PROPS_BUILDER_IAM: {
			OpenIdConnectProviderPropsBuilder_iam openIdConnectProviderPropsBuilder_iam = (OpenIdConnectProviderPropsBuilder_iam) theEObject;
			T result = caseOpenIdConnectProviderPropsBuilder_iam(openIdConnectProviderPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.GROUP_PROPS_BUILDER_IAM: {
			GroupPropsBuilder_iam groupPropsBuilder_iam = (GroupPropsBuilder_iam) theEObject;
			T result = caseGroupPropsBuilder_iam(groupPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.ROLE_BUILDER_IAM: {
			RoleBuilder_iam roleBuilder_iam = (RoleBuilder_iam) theEObject;
			T result = caseRoleBuilder_iam(roleBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.SERVICE_PRINCIPAL_BUILDER_IAM: {
			ServicePrincipalBuilder_iam servicePrincipalBuilder_iam = (ServicePrincipalBuilder_iam) theEObject;
			T result = caseServicePrincipalBuilder_iam(servicePrincipalBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.GRANT_ON_PRINCIPAL_OPTIONS_BUILDER_IAM: {
			GrantOnPrincipalOptionsBuilder_iam grantOnPrincipalOptionsBuilder_iam = (GrantOnPrincipalOptionsBuilder_iam) theEObject;
			T result = caseGrantOnPrincipalOptionsBuilder_iam(grantOnPrincipalOptionsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.USER_BUILDER_IAM: {
			UserBuilder_iam userBuilder_iam = (UserBuilder_iam) theEObject;
			T result = caseUserBuilder_iam(userBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.GRANT_ON_PRINCIPAL_AND_RESOURCE_OPTIONS_BUILDER_IAM: {
			GrantOnPrincipalAndResourceOptionsBuilder_iam grantOnPrincipalAndResourceOptionsBuilder_iam = (GrantOnPrincipalAndResourceOptionsBuilder_iam) theEObject;
			T result = caseGrantOnPrincipalAndResourceOptionsBuilder_iam(grantOnPrincipalAndResourceOptionsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.MANAGED_POLICY_BUILDER_IAM: {
			ManagedPolicyBuilder_iam managedPolicyBuilder_iam = (ManagedPolicyBuilder_iam) theEObject;
			T result = caseManagedPolicyBuilder_iam(managedPolicyBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.FROM_ROLE_ARN_OPTIONS_BUILDER_IAM: {
			FromRoleArnOptionsBuilder_iam fromRoleArnOptionsBuilder_iam = (FromRoleArnOptionsBuilder_iam) theEObject;
			T result = caseFromRoleArnOptionsBuilder_iam(fromRoleArnOptionsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_DOCUMENT_BUILDER_IAM: {
			PolicyDocumentBuilder_iam policyDocumentBuilder_iam = (PolicyDocumentBuilder_iam) theEObject;
			T result = casePolicyDocumentBuilder_iam(policyDocumentBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_BUILDER_IAM: {
			PolicyBuilder_iam policyBuilder_iam = (PolicyBuilder_iam) theEObject;
			T result = casePolicyBuilder_iam(policyBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_DOCUMENT_PROPS_BUILDER_IAM: {
			PolicyDocumentPropsBuilder_iam policyDocumentPropsBuilder_iam = (PolicyDocumentPropsBuilder_iam) theEObject;
			T result = casePolicyDocumentPropsBuilder_iam(policyDocumentPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.USER_PROPS_BUILDER_IAM: {
			UserPropsBuilder_iam userPropsBuilder_iam = (UserPropsBuilder_iam) theEObject;
			T result = caseUserPropsBuilder_iam(userPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.ADD_TO_RESOURCE_POLICY_RESULT_BUILDER_IAM: {
			AddToResourcePolicyResultBuilder_iam addToResourcePolicyResultBuilder_iam = (AddToResourcePolicyResultBuilder_iam) theEObject;
			T result = caseAddToResourcePolicyResultBuilder_iam(addToResourcePolicyResultBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_STATEMENT_PROPS_BUILDER_IAM: {
			PolicyStatementPropsBuilder_iam policyStatementPropsBuilder_iam = (PolicyStatementPropsBuilder_iam) theEObject;
			T result = casePolicyStatementPropsBuilder_iam(policyStatementPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.ADD_TO_PRINCIPAL_POLICY_RESULT_BUILDER_IAM: {
			AddToPrincipalPolicyResultBuilder_iam addToPrincipalPolicyResultBuilder_iam = (AddToPrincipalPolicyResultBuilder_iam) theEObject;
			T result = caseAddToPrincipalPolicyResultBuilder_iam(addToPrincipalPolicyResultBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_STATEMENT_BUILDER_IAM: {
			PolicyStatementBuilder_iam policyStatementBuilder_iam = (PolicyStatementBuilder_iam) theEObject;
			T result = casePolicyStatementBuilder_iam(policyStatementBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.SERVICE_PRINCIPAL_OPTS_BUILDER_IAM: {
			ServicePrincipalOptsBuilder_iam servicePrincipalOptsBuilder_iam = (ServicePrincipalOptsBuilder_iam) theEObject;
			T result = caseServicePrincipalOptsBuilder_iam(servicePrincipalOptsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.UNKNOWN_PRINCIPAL_BUILDER_IAM: {
			UnknownPrincipalBuilder_iam unknownPrincipalBuilder_iam = (UnknownPrincipalBuilder_iam) theEObject;
			T result = caseUnknownPrincipalBuilder_iam(unknownPrincipalBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.MANAGED_POLICY_PROPS_BUILDER_IAM: {
			ManagedPolicyPropsBuilder_iam managedPolicyPropsBuilder_iam = (ManagedPolicyPropsBuilder_iam) theEObject;
			T result = caseManagedPolicyPropsBuilder_iam(managedPolicyPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM: {
			OpenIdConnectProviderBuilder_iam openIdConnectProviderBuilder_iam = (OpenIdConnectProviderBuilder_iam) theEObject;
			T result = caseOpenIdConnectProviderBuilder_iam(openIdConnectProviderBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.LAZY_ROLE_BUILDER_IAM: {
			LazyRoleBuilder_iam lazyRoleBuilder_iam = (LazyRoleBuilder_iam) theEObject;
			T result = caseLazyRoleBuilder_iam(lazyRoleBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.COMMON_GRANT_OPTIONS_BUILDER_IAM: {
			CommonGrantOptionsBuilder_iam commonGrantOptionsBuilder_iam = (CommonGrantOptionsBuilder_iam) theEObject;
			T result = caseCommonGrantOptionsBuilder_iam(commonGrantOptionsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.GRANT_WITH_RESOURCE_OPTIONS_BUILDER_IAM: {
			GrantWithResourceOptionsBuilder_iam grantWithResourceOptionsBuilder_iam = (GrantWithResourceOptionsBuilder_iam) theEObject;
			T result = caseGrantWithResourceOptionsBuilder_iam(grantWithResourceOptionsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.LAZY_ROLE_PROPS_BUILDER_IAM: {
			LazyRolePropsBuilder_iam lazyRolePropsBuilder_iam = (LazyRolePropsBuilder_iam) theEObject;
			T result = caseLazyRolePropsBuilder_iam(lazyRolePropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.POLICY_PROPS_BUILDER_IAM: {
			PolicyPropsBuilder_iam policyPropsBuilder_iam = (PolicyPropsBuilder_iam) theEObject;
			T result = casePolicyPropsBuilder_iam(policyPropsBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case IamPackage.GROUP_BUILDER_IAM: {
			GroupBuilder_iam groupBuilder_iam = (GroupBuilder_iam) theEObject;
			T result = caseGroupBuilder_iam(groupBuilder_iam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePropsBuilder_iam(RolePropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Principal Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Principal Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownPrincipalPropsBuilder_iam(UnknownPrincipalPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Id Connect Provider Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Id Connect Provider Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenIdConnectProviderPropsBuilder_iam(OpenIdConnectProviderPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupPropsBuilder_iam(GroupPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBuilder_iam(RoleBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Principal Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Principal Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicePrincipalBuilder_iam(ServicePrincipalBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grant On Principal Options Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grant On Principal Options Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrantOnPrincipalOptionsBuilder_iam(GrantOnPrincipalOptionsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserBuilder_iam(UserBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grant On Principal And Resource Options Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grant On Principal And Resource Options Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrantOnPrincipalAndResourceOptionsBuilder_iam(GrantOnPrincipalAndResourceOptionsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed Policy Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed Policy Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedPolicyBuilder_iam(ManagedPolicyBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Role Arn Options Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Role Arn Options Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromRoleArnOptionsBuilder_iam(FromRoleArnOptionsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Document Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Document Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDocumentBuilder_iam(PolicyDocumentBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyBuilder_iam(PolicyBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Document Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Document Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyDocumentPropsBuilder_iam(PolicyDocumentPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPropsBuilder_iam(UserPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add To Resource Policy Result Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add To Resource Policy Result Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddToResourcePolicyResultBuilder_iam(AddToResourcePolicyResultBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Statement Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Statement Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyStatementPropsBuilder_iam(PolicyStatementPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add To Principal Policy Result Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add To Principal Policy Result Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddToPrincipalPolicyResultBuilder_iam(AddToPrincipalPolicyResultBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Statement Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Statement Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyStatementBuilder_iam(PolicyStatementBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Principal Opts Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Principal Opts Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicePrincipalOptsBuilder_iam(ServicePrincipalOptsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Principal Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Principal Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownPrincipalBuilder_iam(UnknownPrincipalBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Managed Policy Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Managed Policy Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagedPolicyPropsBuilder_iam(ManagedPolicyPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Id Connect Provider Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Id Connect Provider Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenIdConnectProviderBuilder_iam(OpenIdConnectProviderBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Role Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Role Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyRoleBuilder_iam(LazyRoleBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Grant Options Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Grant Options Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonGrantOptionsBuilder_iam(CommonGrantOptionsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grant With Resource Options Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grant With Resource Options Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrantWithResourceOptionsBuilder_iam(GrantWithResourceOptionsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lazy Role Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lazy Role Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLazyRolePropsBuilder_iam(LazyRolePropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Props Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Props Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyPropsBuilder_iam(PolicyPropsBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Builder iam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Builder iam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBuilder_iam(GroupBuilder_iam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IamSwitch
