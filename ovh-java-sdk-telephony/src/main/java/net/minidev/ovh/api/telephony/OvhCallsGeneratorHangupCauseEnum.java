package net.minidev.ovh.api.telephony;

/**
 * Types of hangupCause for generated calls.
 */
public enum OvhCallsGeneratorHangupCauseEnum {
	AccessInformationDiscarded("AccessInformationDiscarded"),
	AllottedTimeout("AllottedTimeout"),
	AttendedTransfer("AttendedTransfer"),
	BlindTransfer("BlindTransfer"),
	CallAwardedbeing("CallAwardedbeing"),
	ChannelTypeNotImplemented("ChannelTypeNotImplemented"),
	ChannelUnacceptable("ChannelUnacceptable"),
	CodeSip403BearerCapabilityNotAuthorized("CodeSip403BearerCapabilityNotAuthorized"),
	CodeSip403IncomingCallsBarred("CodeSip403IncomingCallsBarred"),
	CodeSip403OutgoingCallsBarred("CodeSip403OutgoingCallsBarred"),
	CodeSip404NoRouteToDestination("CodeSip404NoRouteToDestination"),
	CodeSip404NoRouteToSpecifiedTransitNetwork("CodeSip404NoRouteToSpecifiedTransitNetwork"),
	CodeSip404UnallocatedNumber("CodeSip404UnallocatedNumber"),
	CodeSip408NoUserResponding("CodeSip408NoUserResponding"),
	CodeSip410NumberChanged("CodeSip410NumberChanged"),
	CodeSip410RedirectionToNewDestination("CodeSip410RedirectionToNewDestination"),
	CodeSip480NoAnswerFromUser("CodeSip480NoAnswerFromUser"),
	CodeSip480NormalUnspecified("CodeSip480NormalUnspecified"),
	CodeSip480SubscriberAbsent("CodeSip480SubscriberAbsent"),
	CodeSip483ExchangeRoutingError("CodeSip483ExchangeRoutingError"),
	CodeSip484InvalidNumberFormatAddressIncomplete("CodeSip484InvalidNumberFormatAddressIncomplete"),
	CodeSip486UserBusy("CodeSip486UserBusy"),
	CodeSip487OriginatorCancel("CodeSip487OriginatorCancel"),
	CodeSip488IncompatibleDestination("CodeSip488IncompatibleDestination"),
	CodeSip488bearerCapabilityNotImplemented("CodeSip488bearerCapabilityNotImplemented"),
	CodeSip501FacilitiesRejected("CodeSip501FacilitiesRejected"),
	CodeSip501RequestedFacilityNotImplemented("CodeSip501RequestedFacilityNotImplemented"),
	CodeSip501ServiceOrOptionNotImplementedUnspecified("CodeSip501ServiceOrOptionNotImplementedUnspecified"),
	CodeSip502DestinationOutOfOrder("CodeSip502DestinationOutOfOrder"),
	CodeSip503BearerCapabilityNotPresentlyAvailable("CodeSip503BearerCapabilityNotPresentlyAvailable"),
	CodeSip503NetworkOutOfOrder("CodeSip503NetworkOutOfOrder"),
	CodeSip503NoCircuitChannelAvailable("CodeSip503NoCircuitChannelAvailable"),
	CodeSip503RequestedCircuitOrChannelNotAvailable("CodeSip503RequestedCircuitOrChannelNotAvailable"),
	CodeSip503SwitchingEquipmentCongestion("CodeSip503SwitchingEquipmentCongestion"),
	CodeSip503TemporaryFailure("CodeSip503TemporaryFailure"),
	CodeSip504RecoveryOnTimerExpiry("CodeSip504RecoveryOnTimerExpiry"),
	CodeSip603CallRejected("CodeSip603CallRejected"),
	Crash("Crash"),
	GatewayDown("GatewayDown"),
	InformationElementOrParameterNonExistentOrNotImplemented("InformationElementOrParameterNonExistentOrNotImplemented"),
	InterworkingUnspecified("InterworkingUnspecified"),
	InvalidCallReferenceValue("InvalidCallReferenceValue"),
	InvalidInformationElementContents("InvalidInformationElementContents"),
	InvalidMessageUnspecified("InvalidMessageUnspecified"),
	LoseRace("LoseRace"),
	ManagerRequest("ManagerRequest"),
	MandatoryInformationElementIsMissing("MandatoryInformationElementIsMissing"),
	MediaTimeout("MediaTimeout"),
	MessageNotCompatibleWithCallState("MessageNotCompatibleWithCallState"),
	MessageNotCompatibleWithCallStateOrMessageTypeNonExistentOrNotImplemented("MessageNotCompatibleWithCallStateOrMessageTypeNonExistentOrNotImplemented"),
	MessageTypeNonExistentOrNotImplemented("MessageTypeNonExistentOrNotImplemented"),
	NormalCallClearing("NormalCallClearing"),
	ParameterNonExistentOrNotImplementedPassedOnNationalUse("ParameterNonExistentOrNotImplementedPassedOnNationalUse"),
	PickedOff("PickedOff"),
	PreEmpted("PreEmpted"),
	ProgressTimeout("ProgressTimeout"),
	ProtocolErrorUnspecified("ProtocolErrorUnspecified"),
	RequestedFacilityNotSubscribed("RequestedFacilityNotSubscribed"),
	ResponseToStatusInquiry("ResponseToStatusInquiry"),
	ServiceOrOptionNotAvailableUnspecified("ServiceOrOptionNotAvailableUnspecified"),
	SystemShutdown("SystemShutdown"),
	UnknownOrCallUnfinished("UnknownOrCallUnfinished"),
	UnspecifiedNoOtherCauseCodesApplicable("UnspecifiedNoOtherCauseCodesApplicable"),
	UserChallenge("UserChallenge"),
	UserNotRegistered("UserNotRegistered");

	final String value;

	OvhCallsGeneratorHangupCauseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
