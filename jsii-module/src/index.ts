const printTicks = (count: number): Promise<void> =>
  new Promise<void>((resolve) => {
    console.log(`JSii-module: (${count}) Processed a tick at ${Date.now()}`);
    setTimeout(() => resolve(), 250);
  }).then(() => printTicks(count));

export class Example {
  private count = 0;

  constructor() {}

  async longRunningSomething() {
    console.log('JSii-module: entering longRunningSomething');
    this.count += 1;
    printTicks(this.count);

    await new Promise((resolve) => setTimeout(resolve, 5000));
    console.log('JSii-module: leaving longRunningSomething');
  }
}
