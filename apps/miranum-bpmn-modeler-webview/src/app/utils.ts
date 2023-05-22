import { ModelerData } from "@miranum-ide/vscode/shared/miranum-modeler";

let formKeys: string[] = [];

export function getFormKeys(): string[] {
    return formKeys;
}

export function setFormKeys(keys: string[]): void {
    formKeys = keys;
}

export function instanceOfModelerData(object: any): object is ModelerData {
    return "bpmn" in object || "additionalFiles" in object;
}