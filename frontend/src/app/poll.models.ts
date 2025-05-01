export interface OptionVote {
    optionText: number;
    votes: string;
}

export  interface Poll {
    id: number;
    question: string;
    options: OptionVote[];
}
