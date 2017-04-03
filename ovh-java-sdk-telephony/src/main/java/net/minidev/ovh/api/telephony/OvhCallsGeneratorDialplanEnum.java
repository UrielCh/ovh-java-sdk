package net.minidev.ovh.api.telephony;

/**
 * Types of dialplan available for callsGenerator.
 */
public enum OvhCallsGeneratorDialplanEnum {
	PlayAudioFile("PlayAudioFile"),
	PlayAudioFileAndTransferCall("PlayAudioFileAndTransferCall"),
	ReadText("ReadText"),
	RequestAppointmentConfirmation("RequestAppointmentConfirmation"),
	RequestAppointmentConfirmationWithTransfer("RequestAppointmentConfirmationWithTransfer");

	final String value;

	OvhCallsGeneratorDialplanEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
